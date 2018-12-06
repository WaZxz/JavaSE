#include<iostream.h>
#define N 5
struct time
{
	float arriveTime;
	float runTime;
	float finishTime;
	float totalTime;
	float weightTotalTime;
	char name;
};
void InputTime(time*p)
{
	int i;
	cout<<"作业名,到达时间,运行时间"<<endl;
	for(i=0;i<=N-1;i++)
	{
		float temp1,temp2;
		char name;
		cout<<"作业名:"<<endl;
		cin>>name;
		p[i].name =name;
		cout<<"到达时间:"<<endl;
		cin>>temp1;
		p[i].arriveTime=temp1;
		cout<<"运行时间:"<<endl;
		cin>>temp2;
		p[i].runTime=temp2;
	}
}
void Print(time*p,float totalTimeSum,float weightTotalTimeSum)
{
	cout<<"作业运行时间为:"<<endl;
	for(int k=0;k<=N;k++)
	{
		cout<<p[k].name <<endl;
	}
	cout<<"平均周转时间:"<<totalTimeSum/N<<endl;
	cout<<"平均周转带权时间:"<<weightTotalTimeSum/N<<endl;
}
void sort(time*p)  //作业按照到达时间排序
{
	for(int i=0;i<=N-1;i++)
		for(int j=0;j<=i;j++)
			if(p[i].arriveTime <p[j].arriveTime)
			{
				time temp;
				temp=p[i];
				p[i]=p[j];
				p[j]=temp;
			}
}
void deal(time*p,float&totalTimeSum,float&weightTotalTimeSum)
{
	int k;
	for(k=0;k<=N-1;k++)
	{
		if(k==0)
			p[k].finishTime=p[k].arriveTime+p[k].runTime;
		else
			p[k].finishTime=p[k-1].finishTime+p[k].runTime;
	}
	for(k=0;k<=N-1;k++)
	{
		p[k].totalTime=p[k].finishTime;
		p[k].weightTotalTime=p[k].totalTime/p[k].runTime;
		totalTimeSum+=p[k].totalTime;
		weightTotalTimeSum+=p[k].weightTotalTime;
	}
}
void FCFS(time*p)
{
	float totalTimeSum=0,weightTotalTimeSum=0;
	sort(p);
	deal(p,totalTimeSum,weightTotalTimeSum);
	cout<<"作业先来先服务顺序为:"<<endl;
	Print(p,totalTimeSum,weightTotalTimeSum);
}
void main()
{
	time a[N];
	InputTime(a);
	time*b=a;
	FCFS(a);
}
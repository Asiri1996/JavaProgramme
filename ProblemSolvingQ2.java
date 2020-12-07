import java.util.*;  
public class ProblemSolvingQ2
{
    public List<Integer> run(List<Integer> a, List<Integer> b)
    {
        int a1=0,b1=0;
        List<Integer> list=new ArrayList<Integer>();
        list.add(0);
        list.add(0);
        for(int i=0;i<a.size();i++){
            if(a.get(i)>b.get(i)){
                list.set(0,++a1);
            }
            else if(a.get(i)<b.get(i)){
                list.set(1,++b1);
            }
            else{
                continue;
            }
        }
        return list;
    }
	public static void main(String[] args) 
	{
		ProblemSolvingQ2 m = new ProblemSolvingQ2(); 
		List<Integer> a=new ArrayList<Integer>();
		List<Integer> b=new ArrayList<Integer>();
		List<Integer> sum;
		a.add(3);
		a.add(7);
		a.add(5);
		b.add(5);
		b.add(7);
		b.add(1);
		sum=m.run(a,b);
		System.out.println(sum);
	}
}

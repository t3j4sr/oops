class CaseSensitive
{
    void show()
        {
            int a=20,b=10,A=30,sum1=0,sum2=0;
            sum1=a+b;
            sum2=A+b;
            System.out.println("Sum1="+sum1);
            System.out.println("Sum2="+sum2);
        }
        public  static void main(String args[])
        {
            CaseSensitive cs=new CaseSensitive();
            cs.show();
        }
    
}
public class commantlineCalc {

    public static void main(String[] args)
     {
try{
        int a,b;
        String o;

      //  System.out.println(args[0]);
        if(args[0].contains("/") || args[0].contains("'*'") || args[0].contains("+") || args[0].contains("-"))
        {
          //  System.out.println(args[0]);
            int i=0;
            String a1="";
            String str=args[0];
          //  System.out.println(args[0]);
            while( str.charAt(i)!='/' || str.charAt(i)!='+' || str.charAt(i)!='-' || str.charAt(i)!='*')
            {
                System.out.println(i);
                a1=a1+str.charAt(i);
                i++;
            }
          //  System.out.println(args[0]);

            o=str.substring(i,i+1);
            System.out.println(o);

            int start=i+1;
            String a2=str.substring(start);

             a=Integer.parseInt(a1);
             b=Integer.parseInt(a2);

             System.out.println(a+" "+b);
        }
        else
        {
             a=Integer.parseInt(args[0].trim());

             o=args[1].trim();
    
             b=Integer.parseInt(args[2].trim());
        }
        int result=0;

        if(o.equals("+"))
        {
            result=a+b;
        }
        else if(o.equals("-"))
        {
            result=a-b;
        }
        else if(o.equals("'*'"))
        {
            result=a*b;
        }
        else if(o.equals("/"))
        {
            result=a/b;
        }

        System.out.println("Result: "+result);

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
   
    }
    
}
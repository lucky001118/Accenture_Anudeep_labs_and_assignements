package MCQPractice;

public class MCQ{


//    public void arr() {
//
//        try{
//
//            int y= 5, j=0;
//            System.out.print(y=y/0 + " ");
//
//        }catch(Exception e)
//
//        {
//
//            e.printStackTrace();
//
//        }
//
//        System.out.print("Hi" + " ");
//
//finally{
//
//            System.out.print("Hi");
//
//        }
//
//    }

//    void process() throws Exception { throw new Exception(); }
//    static class B extends MCQ {
//
//        void process() { System.out.println("B"); }
//
//    }

//    public void process() { System.out.print("A "); }

    public static void main(String[] args) {

        MCQ mcq = new MCQ();
//        mcq.arr();
//        try{
//
//            int j=0, x;
//
//            x=Double.parseDouble(args[j]);
//
//            System.out.println(x/0);
//
//        }catch(Exception e) {
//
//            System.out.println("Hi");
//
//        }

//        try{
//
//            throw new RuntimeException();
//
//        }catch(RuntimeException e) {
//
//            try{
//
//                System.out.println("Hello");
//
//                e.printStackTrace();
//
//            }
//
//            System.out.println("SCJP");
//
//catch(Exception x) {
//
//                System.out.println(x);
//
//            }
//
//        }


//        new B().process();

//        try { ((MCQ)new B()).process(); }
//
//        catch (Exception e) { System.out.print("Exception "); }

        try {

            for(int i=0;i<5;++i) {

                System.out.println(args[i]);

            }

        }

        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Exception Generated:"+e);

        }

        finally

        {}

    }
}

//class B extends MCQ {

//    public void process() throws RuntimeException
//
//    {
//
//        super.process();
//
//        if (true) throw new RuntimeException();
//
//        System.out.print("B"); }
//
//}

//class A1 {
//
//    A1() throws Exception {
//    }
//}


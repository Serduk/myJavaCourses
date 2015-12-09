//package pmHomeWork;
//
//import java.util.ArrayList;
//
///**
// * Created by serdyuk on 11/16/15.
// */
//public class MainArrayListCruiz {
//    public static void main(String [] args) {
//        CruizList[] arr = new CruizList[100];
//
//        for (int i = 0; i < 5; i++) {
//            CruizList<> cl = new ArrayList();
//
//            cl.setType(i);
//            cl.setName(i);
//            cl.setLongway((int) (Math.random() * 100));
//            cl.setCapacity((int) (Math.random() * 100));
//            cl.setSpeed((int) (Math.random() * 100));
//            cl.setPrice((Math.random() * 100));
//
//            arr[i] = cl;
//            System.out.println(i + " | " + cl.getType() + " | " + cl.getName()
//                    + " | " + cl.getLongway() + " | " + cl.getCapacity()
//                    + " | " + cl.getSpeed() + " | " + cl.getPrice()
//                    + " | " + cl.getResult() + " | " + cl.getTraffic());
//        }
//    }
//}
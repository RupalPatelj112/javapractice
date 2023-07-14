public class Piramid_pattern {
//            /** Piramid of 1234 **/
//        int k=1;
//        for(int i=0;i<5;i++)
//        {
//
//            for (int j=0;j<5-i;j++)
//            {
//                System.out.print(k);
//                System.out.print("\t");
//                k++;
//            }
//            System.out.println("");
//        }

    public void pattern() {

        for (int i = 0; i < 5; i++) {
            int k = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println("");
        }
    }

}

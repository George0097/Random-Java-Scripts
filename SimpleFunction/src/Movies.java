
 class Movies {


    private final int RDate;
    private final String MName;

    private Movies(String Name, int Date) {

        RDate = Date;
        MName = Name;


    }





        public static void main (String[]Args){

        Movies m1 = new Movies("Shawshank Redemption", 1994);
        Movies m2 = new Movies("The Godfather", 1972);
        Movies m3 = new Movies("The Dark Knight", 2008);
        System.out.println(m1.MName + " " + m1.RDate);
            System.out.println(m2.MName + " " + m2.RDate);
            System.out.println(m3.MName + " " + m3.RDate);
    }

    }

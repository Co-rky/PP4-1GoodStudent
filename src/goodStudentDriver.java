public class goodStudentDriver
{
    public static void main(String[] args)
    {
        GoodStudent alan = new GoodStudent("Alan", "Turing", 191254, 3.56, true);
        GoodStudent florence = new GoodStudent("Florence", "Nightingale", 182010, 3.89, false);
        GoodStudent grace  = new GoodStudent("Grace", "Hopper", 190692, 3.99, true);

        System.out.println(alan.toString());
        System.out.println();

        florence.setIdNum(95366);
        florence.setGpa(3.92);
        System.out.println("Florence's new ID: " + florence.getIdNum());
        System.out.println("Florence's new GPA: " + florence.getGpa());
        System.out.println();

        System.out.println("Grace's first name: " + grace.getFirstName());
        System.out.println("Grace's CS status: " + grace.getCsStudent());
        System.out.println();

        System.out.println("Alan's Student ID: " + alan.CreateID());
        System.out.println("Florence's Student ID: " + florence.CreateID());
        System.out.println("Grace's Student ID: " + grace.CreateID());
        System.out.println("Alan's GPA after (possible) benefit: " + alan.CSGPA());
        System.out.println("Florence's GPA after (possible) benefit: " + florence.CSGPA());
        System.out.println("Grace's GPA after (possible) benefit: " + grace.CSGPA());
    } // end method main
} // end class GoodStudentDriver
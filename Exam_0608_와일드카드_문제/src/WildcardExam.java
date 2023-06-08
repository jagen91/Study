public class WildcardExam {
    public static void addBox(Box<? extends Integer> b1, Box<? extends Integer> b2, Box<? super Integer> b3)
    {
        b3.set(b1.get() + b2.get());

        b1.set(b2.get() + b3.get());
    }    
}

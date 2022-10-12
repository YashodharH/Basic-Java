public class While {
    public static void main(String[] args) {
        int i=1;
        while(i<=20)
        {
            if(i%2==0)
            {
                System.out.println("even is "+i);

            }
            else
            {
                System.out.println("odd is "+i);
            }
            i++;
        }
    }
    
}

public class Q4 

{

    public static void main(String[] args)

    {

        char ch[] = {'c', 'a', 'r'};

        for (int i = 0; i < ch.length; i++)

        {

            for (int j = 0; j < ch.length; j++) 

            {

                for (int k = 0; k < ch.length; k++)

                {

                    if (i != j && j != k && i != k)

                    {

                        System.out.println(ch[i] + "" + ch[j] + "" + ch[k]);

                    }

                }

            }

        }

    }

}
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class WordlistGeneratorUsingJava
{
    public void main()
    {
        char a,b,c,d,e,f,g,h;   //8 characters in word. for more add more variables
        String s="";            //Empty string that will contain all words
        m='A';                  //Starting character ASCII 65
        t='~';                  //Ending Character ASCII 176
        try
        {
            File file=new File("8CharWordlist.txt");
            if(!file.exists())
                file.createNewFile();
            FileWriter fw=new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw=new BufferedWriter(fw);
            for(a=m;a<=t;a++)
            {
                for(b=m;b<=t;b++)
                {
                    for(c=m;c<=t;c++)
                    {
                        for(d=m;d<=t;d++)
                        {
                            for(e=m;e<=t;e++)
                            {
                                for(f=m;f<=t;f++)
                                {
                                    for(g=m;g<=t;g++)
                                    {
                                        for(h=m;h<=t;h++)
                                        {
                                            s=""+a+b+c+d+e+f+g+h;
                                            bw.write(s);
                                            bw.newLine();
                                            //System.out.println(s);    //To print out each word
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            bw.close();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
}


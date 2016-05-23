

package connection;

/**
 *
 * @author Jaswant as root user
 */
public class Path {
    static String separator = "/";
    //static String path = "/var/lib/tomcat7/webapps/codeoj";
    static String path = "/home/let_me_start/NetBeansProjects/codeoj/web";
    public static String getPath()
    {
       return path+separator;
    }  
    public static String getArgPath(String a)
    {
        String temp =  path+separator+a+separator;
        return temp;
    }
    
    public static String getArgPath(String a,String b)
    {
        String temp =  path+separator+a+separator+b+separator;
        return temp;
    }
    public static String getArgPath(String a,String b,String c)
    {
        String temp =  path+separator+a+separator+b+separator+c+separator;
        return temp;
    }
    public static String getArgPath(String a,String b,String c,String d)
    {
        String temp =  path+separator+a+separator+b+separator+c+separator+d+separator;
        return temp;
    }
}

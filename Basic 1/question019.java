// Write a Java program to check whether Java is installed on your computer.
// Expected Output
// Java Version: 1.8.0_71                                                            
// Java Runtime Version: 1.8.0_71-b15                                                
// Java Home: /opt/jdk/jdk1.8.0_71/jre                                               
// Java Vendor: Oracle Corporation                                                   
// Java Vendor URL: http://Java.oracle.com/                                          
// Java Class Path: .

class question19{
    public static void main(String [] args){
        System.out.println("Java version:"+System.getProperty("java.version"));
        System.out.println("Java runtime version:"+System.getProperty("java.runtime.version"));
        System.out.println("Java home:"+System.getProperty("java.home"));
        System.out.println("Java vendor:"+System.getProperty("java.vendor"));
        System.out.println("Java vneder url:"+System.getProperty("java.vendor.url"));
        System.out.println("Java class path:"+System.getProperty("java.class.path"));
    }
}

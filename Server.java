import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.*;
class Server
{
public static void main(String args[])throws Exception
{
String filename;
System.out.println("Enter File Name: ");
Scanner sc=new Scanner(System.in);
filename=sc.nextLine();
sc.close();

//create server socket on port 5000
ServerSocket ss=new ServerSocket(5000);
System.out.println ("Waiting for request");
Socket s=ss.accept();
System.out.println ("Connected With "+s.getInetAddress().toString());
DataInputStream din=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
try
{
String str="";
str=din.readUTF();
System.out.println("SendGet....Ok");
if(!str.equals("stop"))
{ System.out.println("Sending File: "+filename);
dout.writeUTF(filename);
dout.flush();
File f=new File(filename);
FileInputStream fin=new FileInputStream(f);
long sz=(int) f.length();
byte b[]=new byte [1024];
int read;
dout.writeUTF(Long.toString(sz));
dout.flush();
System.out.println ("Size: "+sz);
System.out.println ("Buf size: "+ss.getReceiveBufferSize()); while((read = fin.read(b)) != -1)
{
dout.write(b, 0, read); dout.flush();
}
fin.close();
System.out.println("..ok"); dout.flush();
}
dout.writeUTF("stop");
System.out.println("Send Complete"); dout.flush();
}
catch(Exception e)
{
e.printStackTrace();
System.out.println("An error occured");
}

File file = new File("clientfile.txt");
FileInputStream fileStream = new FileInputStream(file); 
InputStreamReader input = new InputStreamReader(fileStream); 
BufferedReader reader = new BufferedReader(input); 
String line; 
          
        // Initializing counters 
        int countWord = 0; 
        int sentenceCount = 0; 
        int characterCount = 0; 
        int paragraphCount = 1; 
        int whitespaceCount = 0; 

while((line = reader.readLine()) != null) 
        { 
            if(line.equals("")) 
            { 
                paragraphCount++; 
            } 
            if(!(line.equals(""))) 
            { 
                  
                characterCount += line.length(); 
                  
                // \\s+ is the space delimiter in java 
                String[] wordList = line.split("\\s+"); 
                  
                countWord += wordList.length; 
                whitespaceCount += countWord -1; 
                  
                // [!?.:]+ is the sentence delimiter in java 
                String[] sentenceList = line.split("[!?.:]+"); 
                  
                sentenceCount += sentenceList.length; 
            } 
        } 
       
        System.out.println("Total word count = " + countWord); 
        System.out.println("Total number of sentences = " + sentenceCount); 
        System.out.println("Total number of characters = " + characterCount); 
        System.out.println("Number of paragraphs = " + paragraphCount); 
        System.out.println("Total number of whitespaces = " + whitespaceCount); 


din.close();
s.close();
ss.close();

}
}

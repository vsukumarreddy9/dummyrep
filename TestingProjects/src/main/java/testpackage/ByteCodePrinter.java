package testpackage;
//package examples;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.io.StringWriter;
//
//import examples.EmployeeMain;
//
//import org.objectweb.asm.ClassReader;
//import org.objectweb.asm.util.TraceClassVisitor;
//
//public class ByteCodePrinter 
//{
//
//public static void main(String[] args) 
//
//	{
//	try {
//	    ClassReader reader = new ClassReader("examples.Employee");
//	    StringWriter sw = new StringWriter();
//	    TraceClassVisitor tcv = new TraceClassVisitor(new PrintWriter(System.out));
//	    reader.accept(tcv, 0);
//	} catch (IOException e) {
//	    e.printStackTrace();
//	}
//
//	}
//
//}

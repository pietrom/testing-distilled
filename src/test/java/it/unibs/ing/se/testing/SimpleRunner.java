package it.unibs.ing.se.testing;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;

import org.junit.Test;

public class SimpleRunner {
	private static String ROOT = "it/unibs/ing/se/testing";
	public static void main(String[] args) throws Exception {
		Enumeration<URL> resources = SimpleRunner.class.getClassLoader().getResources(ROOT);
		for (URL res : Collections.list(resources)) {
			System.out.println("CC");
			System.out.println(res);
			File file = new File(res.toURI());
			System.out.println(file);
			File[] files= file.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File pathname) {
					return pathname.isFile() && pathname.toString().endsWith("Test.class");
				}
			});
			System.out.println(files.length);
			for (File test : files) {
				String testClassStr = test.toString();
				String testClssName = testClassStr.substring(testClassStr.indexOf(ROOT))
						.replace(".class", "").replaceAll("/", ".");
				System.out.println(testClssName);
				Class clazz = Class.forName(testClssName);
				for (Method method : clazz.getMethods()) {
					if(method.isAnnotationPresent(Test.class)) {
						try {
							method.invoke(clazz.newInstance(), null);
							System.out.println("Test method: " + method.getName() + " is GREEN");
						} catch(AssertionError ae) {
							System.out.println("Test method: " + method.getName() + " is RED");
						}
					}
				}
			}
		}
	}
}

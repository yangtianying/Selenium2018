package com.edu.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
/*
 * ����ʵ�����ⲿ�����ļ�������ҳ��Ԫ�صĶ�λ���ʽ
 */
public class ObjectMap {

	Properties prop = null;

	public ObjectMap(String propFile) {
		prop = new Properties();
		FileInputStream in;
		try {
			in = new FileInputStream(propFile);
			prop.load(in);
			in.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}


	public By getlocator(String ElementNameInProp) throws Exception {
		String locator = prop.getProperty(ElementNameInProp);
		// ���ݲ����������������ļ��ж�ȡ��Ӧ�����ö���
		String locatorType = locator.split(":")[0];
		String locatorValue1 = locator.split(":")[1];
		String locatorValue = new String(locatorValue1.getBytes("ISO8859-1"), "UTF-8");
		System.out.println("��ȡ�Ķ�λ���ͣ�" + locatorType + "��ȡ�Ķ�λ���ʽ��" + locatorValue);
		if (locatorType.toLowerCase().equals("id"))
			return By.id(locatorValue);
		else if (locatorType.toLowerCase().equals("name"))
			return By.name(locatorValue);
		else if (locatorType.toLowerCase().equals("tag"))
			return By.tagName(locatorValue);
		else if (locatorType.toLowerCase().equals("class"))
			return By.className(locatorValue);
		else if (locatorType.toLowerCase().equals("css"))
			return By.cssSelector(locatorValue);
		else if (locatorType.toLowerCase().equals("link"))
			return By.linkText(locatorValue);
		else if (locatorType.toLowerCase().equals("xpath"))
			return By.xpath(locatorValue);
		else
			throw new Exception("�����locatorTypeδ�ڳ����б�����" + locatorType);
	}

}

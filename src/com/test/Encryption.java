package com.test;

import java.util.ArrayList;
import java.util.List;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;


public class Encryption {

	public static void main(String[] args) {
		Encryption encryptionObj = new Encryption();
		List<String> list = new ArrayList<String>();
		
		list.add("bRSx0dvbj1TUiflxXTFB5CXUlloqdz89");
		list.add("9937");
		list.add("zH0gUPZvDZjtt3JSQ5OfLo8hivBy99nY");
		list.add("/nWl11RsZB0PjoalVATbCeOFhGlw7Fhq");
		list.add("PVGTyaq1rkN77F82nSRVcY0B2Tm45Cub");
		list.add("sxXyYcHtRi7pO+hFt3ZCgycYMGvNNPsQ");
		list.add("tKHrmX9NxPl5UXzCiIAMQQVSlPv0pSPN");
		list.add("kr2fI1ktjrWwPGLWA0xY74pfeCMJkQxX");
		list.add("Eb16WUDog0skTF/8Cs6W7SLxctpgfrxg");
		list.add("MR/oAAfbit5Yh+hzV4D71ekh+r1d0reE");
		list.add("4pv17wppj4ihART+RzmEvn0HFb2Kgfwn");
		list.add("sfRU622udhEC79nmvLHTasFw8S/9EJnE");
		list.add("dzjJor3Qu/caHcSWVoL+zleic5sHeTjm");
		list.add("UINHDS6Yk1QuNMlG/M+764JZPTxBVWq6");
		list.add("yO1VunR0Eg/WpWLgRht7VwohN0qpHjWV");
		list.add("qMr4owKxqVm+WcPZWaFOsPCbtzSRPV+o");
		list.add("OxpdBK+WcUeyxGAj+q8OhCB0OIe2e5Dj");
		list.add("RIFnlfpLA7oXDrPXC18QVeTFkIA7Krzm");
		list.add("+UKeSxSOYSlSG40F8s3d55ALlOqhR3XU");
		list.add("Lzfcr7HlO+ofiiTUaRf8jkFZr2zGmJJP");
		list.add("/DB6NCGls7Fo12+0dOEQDzhX92YADzsZ");
		list.add("06DrkrHwjdzBbx7Em7xwbW2tqwOWD69j");
		list.add("Xh0qBcGa+jxH/dKv7bCe+ayYjY9bXFli");
		list.add("XhGzGh/LmpsHWPl3RN37vfa0JFXIL+RA");
		list.add("fSqiGY1pO5xwBh+KcD8p8FGyxalTPnpC");
		list.add("gsymW3itwxppNtNEt0wIctPj+XRk1uQk");
		list.add("L3kHn1WzeHUsdkxynF2ht5fNvJ721ECJ");
		list.add("YSyzur1hF3yI7ejXT8mn3EZ7ujCkXIqL");
		
			
		for(String s:list) {
			System.out.println(s +"---:"+encryptionObj.encrypt(s));
			System.out.println(s +"decrypt---:"+encryptionObj.decrypt(s));
			}
	

	}

	
	
	public String encrypt(String unencryptedString) {
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword("sd3W4SSd90ik2shby");
		encryptor.setAlgorithm("PBEWithMD5AndDES");
		return encryptor.encrypt(unencryptedString);
	}

	public String decrypt(String encryptedString) {
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword("sd3W4SSd90ik2shby");
		encryptor.setAlgorithm("PBEWithMD5AndDES");
		return encryptor.decrypt(encryptedString);
	}
}

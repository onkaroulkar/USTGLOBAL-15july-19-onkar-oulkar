package com.dev.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataVerification {

	Pattern pat = null;
	Matcher mat = null;

	public boolean idVer(String id) {

		pat = Pattern.compile("\\d+");
		mat = pat.matcher(id);
		if(mat.matches()) {
			return true;
		}
		return false;
	}

	public boolean nameVer(String name) {

		pat = Pattern.compile("\\w+\\s\\w+");
		mat = pat.matcher(name);
		if(mat.matches()) {
			return true;
		}
		return false;
	}
	
	public boolean emailVer(String email) {

		pat = Pattern.compile("\\w+\\W\\w+\\.\\w+");
		mat = pat.matcher(email);
		if(mat.matches()) {
			return true;
		}
		return false;
	}
	
	public boolean passVer(String pass) {

		pat = Pattern.compile("\\w+");
		mat = pat.matcher(pass);
		if(mat.matches()) {
			return true;
		}
		return false;
	}
}

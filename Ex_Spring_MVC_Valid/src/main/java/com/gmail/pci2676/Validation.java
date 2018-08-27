package com.gmail.pci2676;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class Validation implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {//검증할 객체의 클래스 타입 정보
		// TODO Auto-generated method stub
		return Student.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors err) {
		// TODO Auto-generated method stub
		Student student = (Student) obj;

		if (student.getName() == null || student.getName().trim().isEmpty()) {
			err.rejectValue("name", "null or empty.");
		}
		
		//아래처럼 간소하게 사용할수도 있다 그러나 이러한 경우가 더 불편한 경우도 있다고 한다.
		//내용을 자신이 마음대로 만들수가 없기때문에 많이쓰이진 않는다.
		//ValidationUtils.rejectIfEmptyOrWhitespace(err, "name", "trouble");
	}

}

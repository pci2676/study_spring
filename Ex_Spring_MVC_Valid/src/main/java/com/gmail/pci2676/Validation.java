package com.gmail.pci2676;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class Validation implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {//������ ��ü�� Ŭ���� Ÿ�� ����
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
		
		//�Ʒ�ó�� �����ϰ� ����Ҽ��� �ִ� �׷��� �̷��� ��찡 �� ������ ��쵵 �ִٰ� �Ѵ�.
		//������ �ڽ��� ������� ������� ���⶧���� ���̾����� �ʴ´�.
		//ValidationUtils.rejectIfEmptyOrWhitespace(err, "name", "trouble");
	}

}

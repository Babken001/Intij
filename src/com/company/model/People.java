package com.company.model;

import com.company.commons.UIDGenerator;
import com.company.commons.Validator;
import com.company.commons.constants.RegExp;

public class People {


    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String education;
    private String workExperience;
    private String trainings;
    private String imagePath;


    public People() {
        setId();
        setFirstName("notDefined");
        setLastName("notDefined");
        setPhone("notDefined");
        setEmail("notDefined");
        setEducation("notDefined");
        setWorkExperience("notDefined");
        setTrainings("notDefined");
        setImagePath("notDefined");
    }

    public People(
            String firstName,
            String lastName,
            String phone,
            String email,
            String education,
            String workExperience,
            String trainings,
            String imagePath
    ) {
        setId();
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setEmail(email);
        setEducation(education);
        setWorkExperience(workExperience);
        setTrainings(trainings);
        setImagePath(imagePath);
    }


//    public String getId() {
//        return id;
//    }
//    public void setId(String id) {
//        this.id = id;
//    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        if (imagePath == null || imagePath.equals("")) {
            this.imagePath = "notDefined";
        } else {
            this.imagePath = imagePath+ getFirstName() + getLastName() + ".jpg";
        }
    }




    private void setId() {
        this.id = UIDGenerator.getUID();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.equals("")) {
            this.firstName = "notDefined";
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.equals("")) {
            this.lastName = "notDefined";
        } else {
            this.lastName = lastName;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (Validator.doValidation(RegExp.regexPhone, phone)) {
            this.phone = "notDefined";
        } else {
            this.phone = phone;

        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (Validator.doValidation(RegExp.regexEmail, email)) {
            this.email = email;
        } else {
            this.email = "notDefined";
        }
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        if (education == null || education.equals("")) {
            this.education = "notDefined";
        } else {
            this.education = education;
        }
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        if (workExperience == null || workExperience.equals("")) {
            this.workExperience = "notDefined";
        } else {
            this.workExperience = workExperience;
        }
    }

    public String getTrainings() {
        return trainings;
    }

    public void setTrainings(String trainings) {
        if (trainings == null || trainings.equals("")) {
            this.trainings = "notDefined";
        } else {
            this.trainings = trainings;
        }
    }

    @Override
    public String toString() {
        return "People{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", workExperience='" + workExperience + '\'' +
                ", trainings='" + trainings + '\'' +
                ", imagePath='" + imagePath + '\'' +
                '}';
    }
}

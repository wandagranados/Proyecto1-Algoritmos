
package domain;

import java.util.Objects;


/**
 *
 * @author C03274
 */
public class Course {
    int credits,code;
    String Description,Coursename ;



    public Course(String Coursename, String Description, int credits, int code) {
        this.credits = credits;
        this.code = code;
        this.Description = Description;
        this.Coursename = Coursename;}

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getcode() {
        return code;
    }

    public void setcode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getCoursename() {
        return Coursename;
    }

    public void setCoursename(String Coursename) {
        this.Coursename = Coursename;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (this.credits != other.credits) {
            return false;
        }
        if (this.code != other.code) {
            return false;
        }
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        if (!Objects.equals(this.Coursename, other.Coursename)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Course{" + "credits=" + credits + ", code=" + code + ", Description=" + Description + ", Coursename=" + Coursename + '}';
    }
    
//Informatics
//EG0124 Integrated Humanities Course I; 6 Credits; This course aims to train young people in the historical, linguistic and philosophical fields.
//EG0088 Cinema and Literature; 2 Credits; This course encourages young people to analyze cinematographic and literal material.
//LM1030 English Reading Strategies I; 4 Credits; This course levels all students in reading English with subjects related to their career.
//IF1400 Logic for Computer Scientists; 2 Credits; This course allows students to develop logical-mathematical thinking so that they can apply it in the development of their career.
//IF1300 Introduction to Computing and Informatics; 4 Credits; This course introduces students to the world of programming, learning algorithmic and logical structures.
//
//Math 
//EG0124 Integrated Humanities Course I; 6 Credits; This course aims to train young people in the historical, linguistic and philosophical fields.
//EG0315 Theater Workshop; 2 Credits; This course introduces students to the world of theater through the practice of shorts and mini videos showing what they have learned in class.
//LM1030 English Reading Strategies I; 4 Credits; This course levels all students in reading English with subjects related to their career.
//FD0548 Introduction to Pedagogy; 3 Credits; This course allows to raise the bases of the teaching methods that are covered in the labor field.
//MA0101 Admission Math; 4  Credits; Course that allows to review and reinforce the mathematical bases so that students can apply them in later courses.
//
//Turism
//EG0124 Integrated Humanities Course I; 6 Credits; This course aims to train young people in the historical, ling|uistic and philosophical fields.
//EG0323 Music Appreciation; 2 Credits; In this course, students will be able to analyze different musical genres and comment on the importance of these rhythms in society.
//LM1030 English Reading Strategies I; 4 Credits; This course levels all students in reading English with subjects related to their career.
//AT1109 Introduction to Anthropology; 4 Credits; Introduces students to an understanding of the social and cultural manifestations of human communities.
//B 0105 Introduction to the Natural History of Costa Rica; 4 Credits; This course provides students with a general review of the history of the natural ecosystem 
//of their country so that they can guide foreigners promoting the enjoyment of all.
//
//English 
//EG0124 Integrated Humanities Course I; 6 Credits; This course aims to train young people in the historical, linguistic and philosophical fields.
//EG0088 Cinema and Literature; 2 Credits; This course encourages young people to analyze cinematographic and literal material.
//LM1030 English Reading Strategies I; 4 Credits; This course levels all students in reading English with subjects related to their career.
//ED0017 Psychosocial Bases of Education; 3 Credits; It leads future professionals towards understanding the thinking of students to improve their treatment of them.
//ED0012 General Didactics; 3 Credits; This course introduces students in the field of teaching methods and techniques used in the teaching of English.
//
//Direction
//EG0124 Integrated Humanities Course I; 6 Credits; This course aims to train young people in the historical, linguistic and philosophical fields.
//EG0315 Theater Workshop; 2 Credits; This course introduces students to the world of theater through the practice of shorts and mini videos showing what they have learned in class.
//LM1030 English Reading Strategies I; 4 Credits; This course levels all students in reading English with subjects related to their career.
//DN0101 Introduction to Business Administration; 3 Credits; This course introduces students to the world of business while learning strategies that they will be able to test in the job market.
//MA0001 Precalculation; 3 Credits; This course that allows to prepare students with what is necessary to be able to face the calculation course in the best way.

}

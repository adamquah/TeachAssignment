
package dao;

import adt.*;
import Entity.TutorCourses;

public class CourseInitializer {
    
    public SortedDoublyLinkedListInterface<TutorCourses> initializeCourses() {
        SortedDoublyLinkedList<TutorCourses> courseList = new SortedDoublyLinkedList<>();
   
    
    //Course for FOAS
        courseList.add(new TutorCourses("BACH 2163", "Polymer Chemistry", 3));
        courseList.add(new TutorCourses("BACH 2223", "Transition Elements and Coordination Compounds", 3));
        courseList.add(new TutorCourses("BACH 2243", "Instrumental Methods of Chemical Analysis", 3));
        courseList.add(new TutorCourses("BACH 2204", "Chemistry Laboratory", 4));
        courseList.add(new TutorCourses("BACH 2253", "Environmental Chemistry and Analysis", 3));
        courseList.add(new TutorCourses("BABS 1213", "Integrated Biology", 3));
        courseList.add(new TutorCourses("BABS 1233", "Microbiology", 3));
        courseList.add(new TutorCourses("BABS 2213", "Principles of Genetics", 3));
        courseList.add(new TutorCourses("BABS 2233", "Physiology and Behaviour of Plants", 3));
        courseList.add(new TutorCourses("BABS 1223", "Ecology and Biodiversity", 3));
        courseList.add(new TutorCourses("BAFS 2333", "Sensory Evaluation", 3));
        courseList.add(new TutorCourses("BAFS 3343", "Food Preservation", 3));
        courseList.add(new TutorCourses("BAFS 2344", "Food Microbiology II", 4));
        courseList.add(new TutorCourses("BAFS 3523", "Therapeutic Nutrition", 3));
        courseList.add(new TutorCourses("BAMS 2414", "Statistics Methods for Scientific Analysis", 4));
        courseList.add(new TutorCourses("BAFS 1353", "Food Analysis", 3));
        courseList.add(new TutorCourses("BAFS 1313", "Introduction to Food Science", 3));
    
        //Course for FOCS
        courseList.add(new TutorCourses("BACS 3183", "Advanced Database Management", 3));
        courseList.add(new TutorCourses("BMCS 2013", "Data Engineering", 3));
        courseList.add(new TutorCourses("BAIT 3003", "Data Warehouse Technology", 3));
        courseList.add(new TutorCourses("BMMS 2074", "Statistics for Data Science", 4));
        courseList.add(new TutorCourses("BAIT 3013", "Information Systems Implementation", 3));
        courseList.add(new TutorCourses("BAIT 3043", "IS Strategy and Management", 3));
        courseList.add(new TutorCourses("BAIT 3133", "Database Administration", 3));
        courseList.add(new TutorCourses("BAIT 2144", "Fundamentals of Computer Networks", 4));
        courseList.add(new TutorCourses("BAMS 1623", "Discrete Mathematics", 3));
        courseList.add(new TutorCourses("BACS 2023", "Object-oriented Programming", 3));
        courseList.add(new TutorCourses("BACS 1053", "Database Management", 3));
        courseList.add(new TutorCourses("BAIT 3013", "Business Intelligence", 3));
        courseList.add(new TutorCourses("BACS 2163", "Software Engineering", 3));
        courseList.add(new TutorCourses("BAIT 2203", "Human Computer Interaction", 3));
        courseList.add(new TutorCourses("BAIT 2073", "Mobile Application Development", 3));
        courseList.add(new TutorCourses("BACS 2173", "Graphic Programming", 3));
        courseList.add(new TutorCourses("BACS 3074", "Artificial Intelligence", 4));
        courseList.add(new TutorCourses("BAIT 3273", "Cloud Computing", 3));
        courseList.add(new TutorCourses("BBMF 3073", "Risk Management", 3));
        courseList.add(new TutorCourses("BMIS 2003", "Blockchain Application Development", 4));
        courseList.add(new TutorCourses("BACS 2063", "Data Structure and Algorithm", 3));
        courseList.add(new TutorCourses("BACS 2033", "Software Requirements Engineering", 3));
        courseList.add(new TutorCourses("BACS 2083", "Formal Methods for Software Engineering", 3));
        courseList.add(new TutorCourses("BACS 2173", "Graphics Programming", 3));
        courseList.add(new TutorCourses("BMMS 2633", "Advanced Discrete Mathematics", 3));
        courseList.add(new TutorCourses("BAIT 3343", "Agile Software Development", 3));
        courseList.add(new TutorCourses("BAIT 3153", "Software Project Management", 3));
        courseList.add(new TutorCourses("BACS 2103", "Software Quality Assurance and Testing", 3));
        courseList.add(new TutorCourses("BAIT 1093", "Introduction to Computer Security", 3));
    
        //Course for FCCI
        courseList.add(new TutorCourses("BHCA 1223", "Basic Photography Skills", 3));
        courseList.add(new TutorCourses("BHCA 1213", "Introduction to Art", 3));
        courseList.add(new TutorCourses("BJEL 2013", "English for Career", 3));
        courseList.add(new TutorCourses("BHFD 2124", "Garment and Pattern Construction II", 4));
        courseList.add(new TutorCourses("BHFD 2133", "Software Application for Fashion", 3));
        courseList.add(new TutorCourses("BHFD 2143", "Advanced Fashion Design Illustration", 3));
    
        //Course for FOET
        courseList.add(new TutorCourses("BTGE 1013", "Engineering Mathematics", 3));
        courseList.add(new TutorCourses("BTMM 2153", "Strength of Materials", 3));
        courseList.add(new TutorCourses("BGMC 4263", "Heat Transfer", 3));
        courseList.add(new TutorCourses("BTGE 2033", "Engineering Statistics", 3));
        courseList.add(new TutorCourses("BTMH 4443", "Robotic Systems and Design", 6));
        courseList.add(new TutorCourses("BGMC 4282", "Finite Element Analysis", 2));
        courseList.add(new TutorCourses("BGMC 2183", "Dynamics", 3));
        courseList.add(new TutorCourses("BTEH 2223", "Microprocessor Systems", 3));
        courseList.add(new TutorCourses("BTMH 1313", "Industrial Control and Automation", 3));
        courseList.add(new TutorCourses("BACS 2114", "Machine Learning", 4));
        courseList.add(new TutorCourses("BGGE 2044", "Project Management and Finance", 4));
        courseList.add(new TutorCourses("BTEC 4213", "Embedded System", 3));
        courseList.add(new TutorCourses("BGEC 3314", "Digital Signal Processing", 4));
        courseList.add(new TutorCourses("BAIT 2123", "Internet of Things", 3));
        courseList.add(new TutorCourses("BTMR 1313", "Electric Circuits", 3));
      
        //Course for FOET
        courseList.add(new TutorCourses("BTGE 1013", "Engineering Mathematics", 3));
        courseList.add(new TutorCourses("BTMM 2153", "Strength of Materials", 3));
        courseList.add(new TutorCourses("BGMC 4263", "Heat Transfer", 3));
        courseList.add(new TutorCourses("BTGE 2033", "Engineering Statistics", 3));
        courseList.add(new TutorCourses("BTMH 4443", "Robotic Systems and Design", 6));
        courseList.add(new TutorCourses("BGMC 4282", "Finite Element Analysis", 2));
        courseList.add(new TutorCourses("BGMC 2183", "Dynamics", 3));
        courseList.add(new TutorCourses("BTEH 2223", "Microprocessor Systems", 3));
        courseList.add(new TutorCourses("BTMH 1313", "Industrial Control and Automation", 3));
        courseList.add(new TutorCourses("BACS 2114", "Machine Learning", 4));
        courseList.add(new TutorCourses("BGGE 2044", "Project Management and Finance", 4));
        courseList.add(new TutorCourses("BTEC 4213", "Embedded System", 3));
        courseList.add(new TutorCourses("BGEC 3314", "Digital Signal Processing", 4));
        courseList.add(new TutorCourses("BAIT 2123", "Internet of Things", 3));
        courseList.add(new TutorCourses("BTMR 1313", "Electric Circuits", 3));
    
        //Course for FOBE
        courseList.add(new TutorCourses("BTBE 2052", "Research Methodology", 2));
        courseList.add(new TutorCourses("BTBE 2023", "Civil Engineering Construction Technlogy", 3));
        courseList.add(new TutorCourses("BTQS 2023", "Measurement of Plumbing and Electrical Services", 3));
        courseList.add(new TutorCourses("BTQS 2054", "Development Economics", 4));
        courseList.add(new TutorCourses("BTQS 3033", "Prices Analysis For External and Plumbing Works", 3));
        courseList.add(new TutorCourses("BTAR 1016", "Design Studio I", 6));
        courseList.add(new TutorCourses("BTAR 1013", "Architectural Graphic Techniques", 3));
        courseList.add(new TutorCourses("BTAR 1052", "Principles of Construction and Materials", 2));
        courseList.add(new TutorCourses("BTAR 1012", "History of Eastern Architecture", 2));
        courseList.add(new TutorCourses("BTAR 1062", "Environmental Science", 2));
    
        //Course for FSSH
        courseList.add(new TutorCourses("BHEL 1913", "English Language", 3));
        courseList.add(new TutorCourses("BBBE 3023", "Research Methodology", 3));
    
        //Courses for FAFB
        courseList.add(new TutorCourses("BBBL 2023", "Commercial Law", 3));
        courseList.add(new TutorCourses("BBDT 2094", "Retail Management", 4));
        courseList.add(new TutorCourses("BBDH 2013", "Human Resource Management", 3));
        courseList.add(new TutorCourses("BBDT 2174", "Social Commerce", 4));
        courseList.add(new TutorCourses("BBDM 3194", "Strategic Planning and Management", 4));
        courseList.add(new TutorCourses("BBBE 1033", "Economics", 3));
        courseList.add(new TutorCourses("BBDM 1043", "Principles of Management", 3));
        courseList.add(new TutorCourses("BMIT 1723", "IT Fundamentals and Applications", 3));
        courseList.add(new TutorCourses("BBDM 1013", "Business Communication", 3));
        courseList.add(new TutorCourses("BBDM 1023", "Business Organisation and Management", 3));
        courseList.add(new TutorCourses("BBMF 1813", "Principles of Finance", 3));
        courseList.add(new TutorCourses("BBDT 1013", "Principles of Marketing", 3));
        courseList.add(new TutorCourses("BAMS 1753", "Financial Mathematics", 3));
        courseList.add(new TutorCourses("BBMF 3713", "Risk Management", 3));
        courseList.add(new TutorCourses("BBDM 2153", "Operations Management", 3));
        courseList.add(new TutorCourses("BBDT 3264", "Big Data Analytics", 4));
        courseList.add(new TutorCourses("BBDT 3244", "Digital Marketing", 4));
        courseList.add(new TutorCourses("BBDM 3303", "Entrepreneurship", 3));
        courseList.add(new TutorCourses("BMCS 2123", "Natural Language Processing", 3));
        courseList.add(new TutorCourses("BBDT 3314", "Business Metrics and Analytics", 4));
        courseList.add(new TutorCourses("MPU - 3133", "Falsafah dan Isu Semasa", 3));
        courseList.add(new TutorCourses("BJEL 1023", "Academic English", 3));
        courseList.add(new TutorCourses("BBFA 2054", "Financial Reporting", 4));
        courseList.add(new TutorCourses("BBMF 2093", "Corporate Finance", 3));
        courseList.add(new TutorCourses("BAMS 1743", "Quantitative Methods", 3));
        courseList.add(new TutorCourses("BBMF 3403", "Alternative Investments", 3));
        courseList.add(new TutorCourses("BBMF 2083", "Insurance Management", 3));
        courseList.add(new TutorCourses("BBMF 3063", "Financial Statement Analysis", 3));
        courseList.add(new TutorCourses("BBMF 3504", "Ethical and Professional Standards", 4));
        courseList.add(new TutorCourses("BBFA 1063", "Financial Accounting", 3));
        courseList.add(new TutorCourses("BBDM 1063", "Organisational Behaviour", 3));
        courseList.add(new TutorCourses("BBDM 3013", "Business Research", 3));
    
        
        return courseList;
    }
    
    }
    
}

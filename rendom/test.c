/*Create a structure to specify data on students given below:
              Roll number, Name, Department, Course, Year of joining
              Assume that there are not more than 100 students in the  college. 
Write a function to print the names of all students who joined  in a particular year.
Write a function to print the data of a student whose roll number is given.
*/

#include <stdio.h>
#include <string.h>

struct Student {
    int rollNumber;
    char name[50];
    char department[20];
    char course[20];
    int yearOfJoining;
};

struct Student students[100];

void printStudentsByYear(int year) {
    for (int i = 0; i < 100; i++) {
        if (students[i].yearOfJoining == year) {
            printf("%s\n", students[i].name);
        }
    }
}

void printStudentByRollNumber(int rollNumber) {
    for (int i = 0; i < 100; i++) {
        if (students[i].rollNumber == rollNumber) {
            printf("Roll Number: %d\n", students[i].rollNumber);
            printf("Name: %s\n", students[i].name);
            printf("Department: %s\n", students[i].department);
            printf("Course: %s\n", students[i].course);
            printf("Year of Joining: %d\n", students[i].yearOfJoining);
            break;
        }
    }
}

int main() {
    int numStudents;
    printf("Enter the number of students (max 100): ");
    scanf("%d", &numStudents);
    
    // read student data
    for (int i = 0; i < numStudents; i++) {
        printf("Enter the data for student %d:\n", i + 1);
        printf("Roll Number: ");
        scanf("%d", &students[i].rollNumber);
        printf("Name: ");
        scanf("%s", students[i].name);
        printf("Department: ");
        scanf("%s", students[i].department);
        printf("Course: ");
        scanf("%s", students[i].course);
        printf("Year of Joining: ");
        scanf("%d", &students[i].yearOfJoining);
    }
    
    // print all students who joined in a particular year
    int year;
    printf("Enter the year to search: ");
    scanf("%d", &year);
    printf("Students who joined in %d:\n", year);
    printStudentsByYear(year);
    
    // print data of a student by roll number
    int rollNumber;
    printf("Enter the roll number to search: ");
    scanf("%d", &rollNumber);
    printStudentByRollNumber(rollNumber);
    
    return 0;
}
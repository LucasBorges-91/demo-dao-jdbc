package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {

  public static void main( String[] args ) {

    Scanner sc = new Scanner( System.in );
    DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

    System.out.println( "=== TEST 1: department findById ===" );
    Department department = departmentDao.findById( 3 );
    System.out.println(department);


    System.out.println( "=== TEST 3: seller findAll ===" );
    List<Department> list = departmentDao.findAll();
    for ( Department obj : list ) {
      System.out.println( obj );
    }

    System.out.println( "=== TEST 4: deparment insert ===" );
    Department newDepartment = new Department( null, "Music");
    departmentDao.insert( newDepartment );
    System.out.println( "Inserted! new id = " + newDepartment.getId() );

    System.out.println( "=== TEST 5: department update ===" );
    Department otherDepartment = departmentDao.findById( 7 );
    otherDepartment.setName( "Weapons" );
    departmentDao.update( otherDepartment );
    System.out.println( "Update completed" );

    System.out.println( "=== TEST 6: department delete ===" );
    System.out.println( "Enter id for delete test: ");
    int id = sc.nextInt();
    departmentDao.deleteByid( id );
    System.out.println( "Delete completed" );

    sc.close();

  }
}


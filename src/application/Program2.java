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

//    System.out.println( "=== TEST 1: sellerById ===" );
//    Seller seller = sellerDao.findById( 3 );
//    System.out.println(seller);
//
//    System.out.println( "=== TEST 2: FindByDepartment ===" );
//    Department department = new Department( 2, null );
//    List<Seller> list = sellerDao.findByDepartment( department );
//    for ( Seller obj : list ) {
//      System.out.println( obj );
//    }
//
//    System.out.println( "=== TEST 3: seller findAll ===" );
//    list = sellerDao.findAll();
//    for ( Seller obj : list ) {
//      System.out.println( obj );
//    }

//    System.out.println( "=== TEST 4: deparment insert ===" );
//    Department newDepartment = new Department( null, "Music");
//    departmentDao.insert( newDepartment );
//    System.out.println( "Inserted! new id = " + newDepartment.getId() );

    System.out.println( "=== TEST 5: department update ===" );
    Department otherDepartment = departmentDao.findById( 7 );
    otherDepartment.setName( "Weapons" );
    departmentDao.update( otherDepartment );
    System.out.println( "Update completed" );
//
//    System.out.println( "=== TEST 6: seller delete ===" );
//    System.out.println( "Enter id for delete test: ");
//    int id = sc.nextInt();
//    sellerDao.deleteByid( id );
//    System.out.println( "Delete completed" );

    sc.close();

  }
}


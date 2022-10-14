package com.yash.crudcollection.serviceImpl;
/**
 * @author ankesh.patil
 */
import java.util.ArrayList;
import java.util.List;

import com.yash.crudcollection.model.Product;
import com.yash.crudcollection.service.Service;



public class ServiceImpl implements Service {
	
	List<Product> list=new ArrayList<Product>();
	
	public  ServiceImpl() {
	    list.add(new Product(101,"Laptop",102000));
	    list.add(new Product(102,"Mobile",12000));
	    list.add(new Product(103,"HeadPhone",1000));
	    list.add(new Product(104,"Projector",12000));
	    list.add(new Product(105,"Television",102000));
	    
	}
	    public List<Product> getDetails() {
	        // TODO Auto-generated method stub
	        return list;
	    }



	   public Product getDetailsById(int id) {
	        // TODO Auto-generated method stub
	        Product data=null;
	        for(int i=0;i<list.size();i++) {
	            if(id==list.get(i).getId()) {
	                data=list.get(i);
	                break;
	                
	            }
	        }
	        return data;
	    }



	   public Product save(Product data) {
	        // TODO Auto-generated method stub
	        list.add(data);
	        
	        return data;
	    }



	   public Product delete(int delete) {
	        // TODO Auto-generated method stub
	        Product data=null;
	        for(int i=0;i<list.size();i++) {
	            if(delete==list.get(i).getId()) {
	                data=list.get(i);
	                list.remove(data);
	            }
	        }
	        return data;
	    }
}

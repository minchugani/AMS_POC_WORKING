package com.walmart.rebates.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class calculation {

public Object buckcal() {

EntityManagerFactory factory = Persistence.createEntityManagerFactory("rebates");
List<String> myList = new ArrayList<String>();
EntityManager em = factory.createEntityManager();
List q = em.createNativeQuery("select a.tranactionid , a.transaction_party ,b.item_number, b.sales_quantity,d.agreement_num "
		+ " (e.tier_rate * b.sales_amount) from trheader a join "
		+ " tritems b on a.tranactionid = b.tranactionid"
		+ " join agreement_vendor c on a.transaction_party = c.vendor_number"
		+ " join agreement_items d on b.item_number = d.item_number and d.agreement_num = c.agreement_num"
		+ " join agreement_tiers e on e.agreement_num = d.agreement_num").getResultList();

List result = new ArrayList();
Map<String, Object> map = new HashMap<String, Object>();
for (int j=0 ; j<q.size(); j++) {
Object[] ar = (Object[]) q.get(j) ;

for (int i=0 ; i <ar.length ; i++) {
if(i==0) {
map.put("TRId",ar[i]);
}
if(i==1) {
map.put("TRVend",ar[i]); }
if(i==2) {
map.put("TRitem",ar[i]);}
if(i==3) {
map.put("Agrnum",ar[i]);
}
}
map.putAll(map);

}

return  map.get("Agrnum") ;
}
}

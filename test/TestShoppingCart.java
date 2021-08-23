package uuu.etgt.test;

import java.util.Set;

import uuu.etgt.entity.CartItem;
import uuu.etgt.entity.Customer;
import uuu.etgt.entity.Product;
import uuu.etgt.entity.ShoppingCart;
import uuu.etgt.exception.ETGTException;
import uuu.etgt.service.CustomerService;
import uuu.etgt.service.ProductService;

public class TestShoppingCart {

	public static void main(String[] args) {
		CustomerService cService = new CustomerService();
		ProductService pService = new ProductService();
		try {
			Customer member = cService.login("A123456798", "aaa9487");
			System.out.println(member);
			
			Product no2 = pService.getProductById("2");
			Product no7 = pService.getProductById("7");
			Product no10 = pService.getProductById("10");
			Product no14 = pService.getProductById("14");
	
			ShoppingCart cart = new ShoppingCart();
			cart.setMemeber(member);
			cart.add(no2, "", "半斤", 1); 
			cart.add(no7, "黑糖", "", 1);
			cart.add(no2, "", "一斤", 5); 
			cart.add(no7, "四川麻辣", "", 1);
			cart.add(no10, "", "", 1); 
			cart.add(no14, "葷", "", 1); 
			
			//cart.getCartItemSet().clear(); //會清空此集合的內容
			
			Set<CartItem> keyset = cart.getCartItemSet();
			//keyset.clear();
			
			if(keyset.size()>0) {
			System.out.println("以下為明細內容...");
				 for(CartItem item:keyset) { //測試副本被刪掉後的影響
			   //for(CartItem item:cart.getCartItemSet()) {
					System.out.println("買" + item.getProduct().getName()+",\t");
					System.out.println(item.getProduct().getUnitPrice()+"元,\t");
					System.out.println((item.getFlavor()==null?"":item.getFlavor().getFlavorName())+",\t");
					System.out.println(item.getWeight()+",\t");
					System.out.println(item.getProduct().getUnitPrice()*cart.getQuantity(item));
					
					System.out.println(cart.getQuantity(item));
					System.out.println("\t小計: "+cart.getAmount(item));
				}
			}else {
				System.out.println("(副本)購物車內容已被清空");
			}
			System.out.println();
			System.out.println("共買了"+cart.size()+"項"+",總共"+ cart.getTotalQuantity()+"件商品");
			System.out.println();
			System.out.println("總金額:"+cart.getTotalAmount() + "元");
			System.out.println();
			System.out.println("cart是否為空購物車: "+cart.isEmpty());
			
			int rowNo = 0;
			for(CartItem item:cart.getCartItemSet()) {
				rowNo++;
				if(rowNo==1) {
					cart.update(item, 3);
					}else if (rowNo==3) {
						cart.remove(item);
					}
				}
			System.out.println("修改後. . . . .");
			System.out.println("修改後 . . . .");
			System.out.println("修改後  . . .");
			System.out.println("修改後   . .");
			System.out.println("修改後    .");

			
			if(keyset.size()>0) {
				System.out.println("以下為明細內容...");
					 for(CartItem item:keyset) { //測試副本被刪掉後的影響
				   //for(CartItem item:cart.getCartItemSet()) {
						System.out.println("買" + item.getProduct().getName()+",\t");
						System.out.println(item.getProduct().getUnitPrice()+"元,\t");
						System.out.println((item.getFlavor()==null?"":item.getFlavor().getFlavorName())+",\t");
						System.out.println(item.getWeight()+",\t");
						System.out.println(item.getProduct().getUnitPrice()*cart.getQuantity(item));
						
						System.out.println(cart.getQuantity(item));
						System.out.println("\t小計: "+cart.getAmount(item));
					}
				}else {
					System.out.println("(副本)購物車內容已被清空");
				}

		} catch (ETGTException e) {
			e.printStackTrace();
		}
		
	}

}

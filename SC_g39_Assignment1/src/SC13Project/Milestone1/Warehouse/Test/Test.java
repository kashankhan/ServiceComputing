package SC13Project.Milestone1.Warehouse.Test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import org.example.warehouse.ObjectFactory;
import org.example.warehouse.WareHouse;

public class Test {
	public static void main(String[] args) throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance("org.example.warehouse");
		Marshaller m = jc.createMarshaller();
		ObjectFactory o = new ObjectFactory();
		WareHouse w = o.createWareHouse();
		w.setHoldingRequests(o.createHoldingRequestList());
		w.setItems(o.createItemList());
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(o.createWarehouse(w), System.out);
		Unmarshaller u = jc.createUnmarshaller();
		WareHouse warehouse = (WareHouse) u.unmarshal(Test.class.getResourceAsStream("warehouse.xml"));
		System.out.println(warehouse.toString());
	}
}

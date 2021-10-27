package com.careerit.util.properties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

public class TenantUtil {

	private List<Tenant> list;
	private Map<String, Tenant> map;

	public TenantUtil() {
		list = loadTenantDetails();
		map = indexValue(list);
	}

	private Map<String, Tenant> indexValue(List<Tenant> list) {
		Map<String, Tenant> map = new HashMap<String, Tenant>();
		for (Tenant t : list) {
			map.put(t.getTname(), t);
		}
		return map;
	}

	public Tenant getTenant(String name) {
		return map.get(name);

	}

	private List<Tenant> loadTenantDetails() {
		Constructor constructor = new Constructor(Tenant.class);
		Yaml yaml = new Yaml(constructor);
		List<Tenant> list = new ArrayList<Tenant>();
		Iterable<Object> arr = yaml.loadAll(Manager.class.getResourceAsStream("/tenants.yaml"));
		for (Object t : arr) {
			if (t instanceof Tenant) {
				Tenant tenant = (Tenant) t;
				list.add(tenant);
			}
		}
		return list;

	}
}

package net.dlhz.psi.sys.entity;

/**
 * 菜单
 * 
 * @author Venz
 * 
 */
public class Menu implements java.io.Serializable {

	private static final long serialVersionUID = -8277958767625162413L;
	private int id;
	private String name;
	private String url;
	private int parentId;
	private String power;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getPower() {
		return this.power;
	}

	public void setPower(String power) {
		this.power = power;
	}

}
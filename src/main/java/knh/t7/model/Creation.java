package knh.t7.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Proxy;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Proxy(lazy = false)
public class Creation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable = false, unique = true)
	private String name;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date releasedate;

	@ManyToOne
	private Category category = new Category();

	@ManyToOne
	private Author author = new Author();

	public Creation() {
		super();
	}
	
	public Creation(String name, int categoryId, int authorId) {
		this();
		this.name = name;
		this.category.setId(categoryId);
		this.author.setId(authorId);
	}

	public Creation(String name, Date releasedate, int categoryId, int authorId) {
		this();
		this.name = name;
		this.releasedate = releasedate;
		this.category.setId(categoryId);
		this.author.setId(authorId);
	}

	public Creation(String name, Category category, Author author) {
		super();
		this.name = name;
		this.category = category;
		this.author = author;
	}

	public Creation(String name, Date releasedate, Category category, Author author) {
		super();
		this.name = name;
		this.releasedate = releasedate;
		this.category = category;
		this.author = author;
	}

	public Creation(int id, String name, Date releasedate, Category category, Author author) {
		super();
		this.id = id;
		this.name = name;
		this.releasedate = releasedate;
		this.category = category;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(Date releasedate) {
		this.releasedate = releasedate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Creation [id=" + id + ", name=" + name + ", releasedate=" + releasedate + ", category=" + category
				+ ", author=" + author + "]";
	}

}

package knh.t7.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy = false)
public class Book_SaleEvent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, columnDefinition = "int unsigned")
	private int salepercent;

	@OneToOne
	private Book book = new Book();

	@OneToOne
	private SaleEvent saleevent = new SaleEvent();

	public Book_SaleEvent() {
		super();
	}
	
	public Book_SaleEvent(int salepercent, int bookId, int saleeventId) {
		this();
		this.salepercent = salepercent;
		this.book.setId(bookId);
		this.saleevent.setId(saleeventId);;
	}


	public Book_SaleEvent(int salepercent, Book book, SaleEvent saleevent) {
		super();
		this.salepercent = salepercent;
		this.book = book;
		this.saleevent = saleevent;
	}

	public Book_SaleEvent(int id, int salepercent, Book book, SaleEvent saleevent) {
		super();
		this.id = id;
		this.salepercent = salepercent;
		this.book = book;
		this.saleevent = saleevent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalepercent() {
		return salepercent;
	}

	public void setSalepercent(int salepercent) {
		this.salepercent = salepercent;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public SaleEvent getSaleevent() {
		return saleevent;
	}

	public void setSaleevent(SaleEvent saleevent) {
		this.saleevent = saleevent;
	}

	@Override
	public String toString() {
		return "Book_SaleEvent [id=" + id + ", salepercent=" + salepercent + ", book=" + book + ", saleevent="
				+ saleevent + "]";
	}

}

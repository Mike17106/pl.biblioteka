package pl.biblioteka.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Date;

@SuppressWarnings("ALL")
@Entity
@Table(name = "rent")
public class Rent {
    @ManyToOne(fetch = FetchType.EAGER)
    private Book book;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String token;
    private Date createDate;

    public Rent(Book book, String token, Date createDate) {
        this.book = book;
        this.token = token;
        this.createDate = createDate;
    }

    public Rent() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rent)) return false;

        Rent rent = (Rent) o;

        if (!getBook().equals(rent.getBook())) return false;
        if (!getId().equals(rent.getId())) return false;
        if (!getToken().equals(rent.getToken())) return false;
        if (!getCreateDate().equals(rent.getCreateDate())) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getBook().hashCode();
        result = 31 * result + getId().hashCode();
        result = 31 * result + getToken().hashCode();
        result = 31 * result + getCreateDate().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "book=" + book +
                ", id=" + id +
                ", token='" + token + '\'' +
                ", createDate=" + createDate +
                '}';
    }


    public final class GenerationToken {
        private final SecureRandom random = new SecureRandom();

        public String TokenGenerator() {return token =new BigInteger(130, random).toString(32);
        }
    }
}


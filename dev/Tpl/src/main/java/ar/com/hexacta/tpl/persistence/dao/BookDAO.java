package ar.com.hexacta.tpl.persistence.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import ar.com.hexacta.tpl.model.Book;
import ar.com.hexacta.tpl.persistence.repository.BookRepository;

public class BookDAO extends AbstractDAO<Book> implements BookRepository {

    public List<Book> findAll(final String publisher) {
        Criteria criteria = this.getSession().createCriteria(Book.class);
        criteria.add(Restrictions.like("publisher", publisher));
        return criteria.list();
    }

}
import grails.persistence.support.PersistenceContextInterceptor
import org.grails.orm.hibernate.AbstractHibernateDatastore

class BootStrap {

    PersistenceContextInterceptor persistenceInterceptor

    def init = { servletContext ->
        println persistenceInterceptor.interceptors[0].dataSourceName
        println persistenceInterceptor.interceptors[0].hibernateDatastore.dataSourceName
        println persistenceInterceptor.interceptors[1].dataSourceName
        println persistenceInterceptor.interceptors[1].hibernateDatastore.dataSourceName
    }
    def destroy = {
    }
}

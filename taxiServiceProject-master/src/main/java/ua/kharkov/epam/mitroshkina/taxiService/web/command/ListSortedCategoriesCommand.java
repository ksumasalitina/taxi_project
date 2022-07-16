package ua.kharkov.epam.mitroshkina.taxiService.web.command;

import org.apache.log4j.Logger;
import ua.kharkov.epam.mitroshkina.taxiService.Path;
import ua.kharkov.epam.mitroshkina.taxiService.db.ClientOrderDao;
import ua.kharkov.epam.mitroshkina.taxiService.db.bean.CategoryBean;
import ua.kharkov.epam.mitroshkina.taxiService.db.bean.ConfirmedOrderBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ListSortedCategoriesCommand extends Command{
    private static final long serialVersionUID = 6112180983295217919L;

    private static final Logger log = Logger.getLogger(ListSortedOrdersByCostCommand.class);

    @Override
    public String execute(HttpServletRequest request,
                          HttpServletResponse response) throws IOException, ServletException, SQLException {
        log.debug("Commands starts");

        List<CategoryBean> categoryBeanList = new ClientOrderDao().sortCategories();
        log.trace("Found in DB: confirmedOrderBeanList --> " + categoryBeanList);

        // put confirmed order beans list to request
        request.setAttribute("confirmedOrderBeanList", categoryBeanList);
        log.trace("Set the request attribute: confirmedOrderBeanList --> " + categoryBeanList);

        log.debug("Commands finished");
        return Path.PAGE__LIST_ALL_ORDERS;
    }
}

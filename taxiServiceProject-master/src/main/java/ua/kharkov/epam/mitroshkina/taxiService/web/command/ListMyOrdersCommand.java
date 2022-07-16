package ua.kharkov.epam.mitroshkina.taxiService.web.command;

import org.apache.log4j.Logger;
import ua.kharkov.epam.mitroshkina.taxiService.Path;
import ua.kharkov.epam.mitroshkina.taxiService.db.bean.ConfirmedOrderBean;
import ua.kharkov.epam.mitroshkina.taxiService.db.ClientOrderDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ListMyOrdersCommand extends Command{
    private static final long serialVersionUID = 6324530438963937663L;

    private static final Logger log = Logger.getLogger(ListMyOrdersCommand.class);

    @Override
    public String execute(HttpServletRequest request,
                          HttpServletResponse response) throws IOException, ServletException, SQLException {
        log.debug("Commands starts");

        int user_id = Integer.parseInt(request.getParameter("user_id"));

        List<ConfirmedOrderBean> orderBeanList = new ClientOrderDao().getOrdersByUser(user_id);
        log.trace("Found in DB: orderBeanList --> " + orderBeanList);

        // put confirmed order beans list to request
        request.setAttribute("orderBeanList", orderBeanList);
        log.trace("Set the request attribute: orderBeanList --> " + orderBeanList);

        log.debug("Commands finished");
        return Path.PAGE__MY_ORDERS;
    }
}

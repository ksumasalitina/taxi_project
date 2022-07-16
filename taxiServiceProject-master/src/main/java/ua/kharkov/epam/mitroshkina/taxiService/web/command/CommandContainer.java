package ua.kharkov.epam.mitroshkina.taxiService.web.command;

import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;

/**
 * Holder for all commands.
 */
public class CommandContainer {

	private static final Logger log = Logger.getLogger(CommandContainer.class);

	private static Map<String, Command> commands = new TreeMap<String, Command>();

	static {
		// common commands
		commands.put("email", new LoginCommand());
		commands.put("logout", new LogoutCommand());
		commands.put("noCommand", new NoCommand());
		commands.put("newClient", new AddClientCommand());
		commands.put("viewAddClient", new ViewAddClientCommand());

		// client commands
		commands.put("viewAddCO", new ViewAddCOCommand());
		commands.put("newClientOrder", new AddClientOrderCommand());
		commands.put("updateStatus", new ConfirmOrderCommand());
		commands.put("myOrders", new ListMyOrdersCommand());
		commands.put("viewMyOrders", new ViewMyOrders());

		// admin commands
		commands.put("listClients", new ListClientsCommand());
		commands.put("listCars", new ListCarsCommand());
		commands.put("listOrders", new ListConfirmedOrdersCommand());
		commands.put("listSortedByDateOrdersDESC", new ListSortedOrdersByDateCommandDESC());
		commands.put("listSortedByDateOrdersASC", new ListSortedOrdersByDateCommandASC());
		commands.put("listSortedByCostOrders", new ListSortedOrdersByCostCommand());
		commands.put("listFilteredByClientsOrders", new ListFilteredOrdersByClientCommand());
		commands.put("listFilteredByDatesOrders", new ListFilteredOrdersByDateCommand());
		commands.put("listCategories", new ListSortedCategoriesCommand());

		log.debug("Command container was successfully initialized");
		log.trace("Number of commands --> " + commands.size());
	}

	/**
	 * Returns command object with the given name.
	 *
	 * @param commandName Name of the command.
	 * @return Command object.
	 */
	public static Command get(String commandName) {
		if (commandName == null || !commands.containsKey(commandName)) {
			log.trace("Command not found, name --> " + commandName);
			return commands.get("noCommand");
		}

		return commands.get(commandName);
	}
}
import me.magnum.birthdays.SimpleConfig;
import me.magnum.birthdays.SimpleConfigManager;
import org.mineacademy.fo.plugin.SimplePlugin;

public class ExampleClass {

	public Birthdays () {
	}

	public SimpleConfigManager manager;
	public SimpleConfig config;

	public SimpleConfig messages;

	@Override
	public void onEnable {

		String[] comments = {"Multiple lines", "Of nice comments", "Are supported !"};
		String[] header = {"This is super simple", "And highly customizable", "new and fresh SimpleConfig !"};

		this.manager = new SimpleConfigManager(this);

		this.config = manager.getNewConfig("config.yml", header);
		this.messages = manager.getNewConfig("misc/messages.yml");

		this.config.set("path1", "value1", comments);
		this.config.set("path2", "value2", "This is second comment !");
		this.config.saveConfig();

	}
}

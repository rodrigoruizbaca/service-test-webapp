package com.siriusxm.idm;

import java.io.Serializable;

import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

public class CloudWatchAppender extends AbstractAppender {
	
	static final String APPENDER_NAME = "sirius-CloudwatchLogs";

	protected CloudWatchAppender(String name, Filter filter, Layout<? extends Serializable> layout) {
		super(name, filter, layout);
	}
		

	public CloudWatchAppender(String name, Filter filter, Layout<? extends Serializable> layout,
			boolean ignoreExceptions) {
		super(name, filter, layout, ignoreExceptions);
	}

	@PluginFactory
	public static CloudWatchAppender createAppender(
			@PluginAttribute("logGroupName") @Required(message = "logGroupName is required") String logGroupName,
		    @PluginAttribute("logStreamNamePrefix") String logStreamNamePrefix,
			@PluginElement("Filter") final Filter filter,
			@PluginElement("Layout") Layout<Serializable> layout) {
		CloudWatchAppender appender = new CloudWatchAppender(logGroupName, filter, layout, true);
		return appender;
	}

	@Override
	public void append(LogEvent logEvent) {
		
	}

}

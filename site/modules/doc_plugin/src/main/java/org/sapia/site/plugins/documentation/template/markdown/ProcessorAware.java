package org.sapia.site.plugins.documentation.template.markdown;

import org.markdown4j.Markdown4jProcessor;

public interface ProcessorAware {

  public void setProcessor(Markdown4jProcessor processor);

}

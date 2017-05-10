/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 9, 2017 7:34:06 AM                      ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.constants.TrainingConstants;

/**
 * Generated class for type <code>TrainingManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTrainingManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("additionalDescription", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.additionalDescription</code> attribute.
	 * @return the additionalDescription - Additional description
	 */
	public String getAdditionalDescription(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, TrainingConstants.Attributes.Product.ADDITIONALDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.additionalDescription</code> attribute.
	 * @return the additionalDescription - Additional description
	 */
	public String getAdditionalDescription(final Product item)
	{
		return getAdditionalDescription( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.additionalDescription</code> attribute. 
	 * @param value the additionalDescription - Additional description
	 */
	public void setAdditionalDescription(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, TrainingConstants.Attributes.Product.ADDITIONALDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.additionalDescription</code> attribute. 
	 * @param value the additionalDescription - Additional description
	 */
	public void setAdditionalDescription(final Product item, final String value)
	{
		setAdditionalDescription( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return TrainingConstants.EXTENSIONNAME;
	}
	
}

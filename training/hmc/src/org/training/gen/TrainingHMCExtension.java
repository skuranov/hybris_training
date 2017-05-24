package org.training.gen;

import de.hybris.platform.hmc.AbstractEditorMenuChip;
import de.hybris.platform.hmc.AbstractExplorerMenuTreeNodeChip;
import de.hybris.platform.hmc.EditorTabChip;
import de.hybris.platform.hmc.extension.HMCExtension;
import de.hybris.platform.hmc.extension.MenuEntrySlotEntry;
import de.hybris.platform.hmc.generic.ClipChip;
import de.hybris.platform.hmc.generic.ToolbarActionChip;
import de.hybris.platform.hmc.webchips.Chip;
import de.hybris.platform.hmc.webchips.DisplayState;

import java.util.*;
import java.util.logging.Logger;

/**
 * Created by root on 5/16/17.
 */
public class TrainingHMCExtension extends HMCExtension {

        @SuppressWarnings("unused")
        private static final Logger LOG = Logger.getLogger(TrainingHMCExtension.class.getName());

        public final static String RESOURCE_PATH = "de.hybris.platform.cuppytrail.hmc.locales";

        @Override
        public List<AbstractExplorerMenuTreeNodeChip> getTreeNodeChips(final DisplayState displayState, final Chip parent)
        {
            return Collections.EMPTY_LIST;
        }

        @Override
        public List<MenuEntrySlotEntry> getMenuEntrySlotEntries(final DisplayState displayState, final Chip parent)
        {
            return Collections.EMPTY_LIST;
        }

        @Override
        public List<ClipChip> getSectionChips(final DisplayState displayState, final ClipChip parent)
        {
            return Collections.EMPTY_LIST;
        }

        @Override
        public List<EditorTabChip> getEditorTabChips(final DisplayState displayState, final AbstractEditorMenuChip parent)
        {
            return Collections.EMPTY_LIST;
        }

        @Override
        public List<ToolbarActionChip> getToolbarActionChips(final DisplayState displayState, final Chip parent)
        {
            return Collections.EMPTY_LIST;
        }

        @Override
        public ResourceBundle getLocalizeResourceBundle(final Locale locale)
        {
            return null;
        }

        @Override
        public String getResourcePath()
        {
            return RESOURCE_PATH;
        }
    
    }

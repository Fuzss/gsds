/*
** 2016 Juni 19
**
** The author disclaims copyright to this source code. In place of
** a legal notice, here is a blessing:
**    May you do good and not evil.
**    May you find forgiveness for yourself and forgive others.
**    May you share freely, never taking more than you give.
 */
package fuzs.gsds;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIAttackRangedBow;
import net.minecraft.entity.monster.AbstractSkeleton;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.util.Timer;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Nico Bergemann <barracuda415 at yahoo.de>
 */
public interface PrivateAccessor {
    
    Logger LOGGER = LogManager.getLogger();

    String[] ABSTRACTSKELETON_AIRARROWATTACK = new String[]{"aiArrowAttack", "field_85037_d"};

    default void setAiArrowAttack(AbstractSkeleton instance, EntityAIAttackRangedBow aitask) {
        try {
            ObfuscationReflectionHelper.setPrivateValue(AbstractSkeleton.class, instance, aitask, ABSTRACTSKELETON_AIRARROWATTACK[1]);
        } catch (Exception ex) {
            LOGGER.error("setAiArrowAttack() failed", ex);
        }
    }
}

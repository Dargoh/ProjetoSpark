package br.dargoh.projetospark.sparktemplate

import br.com.devsrsouza.kotlinbukkitapi.architecture.KotlinPlugin
import br.com.devsrsouza.kotlinbukkitapi.dsl.command.command
import br.com.devsrsouza.kotlinbukkitapi.extensions.text.msg
import br.com.devsrsouza.kotlinbukkitapi.extensions.text.translateColor

class SparkTemplate : KotlinPlugin() {

    fun registerAnother() = command("another") {
        permission = "cmd.another"
        permissionMessage = "&cVocê não tem permissão para utilizar este comando.".translateColor()

        executor {
            sender.msg("&cAnother command!".translateColor())
        }

        command("subanother") {
            executor {
                sender.msg("&cSub another command!".translateColor())
            }
        }
    }

    override fun onPluginDisable(){
        logger.info("Desligando.")
    }

}
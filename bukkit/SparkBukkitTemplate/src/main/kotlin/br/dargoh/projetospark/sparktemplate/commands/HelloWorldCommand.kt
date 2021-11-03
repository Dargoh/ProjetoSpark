package br.dargoh.projetospark.sparktemplate.commands

import br.com.devsrsouza.kotlinbukkitapi.architecture.lifecycle.LifecycleListener
import br.com.devsrsouza.kotlinbukkitapi.dsl.command.command
import br.com.devsrsouza.kotlinbukkitapi.dsl.command.simpleCommand
import br.com.devsrsouza.kotlinbukkitapi.extensions.text.msg
import br.com.devsrsouza.kotlinbukkitapi.extensions.text.translateColor
import br.dargoh.projetospark.sparktemplate.SparkTemplate

class HelloWorldCommand(override val plugin: SparkTemplate) : LifecycleListener<SparkTemplate> {

    override fun onPluginEnable(){
        plugin.logger.info("teste")
        registerAnother()
        registerHelloWorld()
    }

    fun registerHelloWorld() = simpleCommand("hello") {
        sender.msg("World!")
    }

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
}
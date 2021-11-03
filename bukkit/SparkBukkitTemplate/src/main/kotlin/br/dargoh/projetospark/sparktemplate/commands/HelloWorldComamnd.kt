package br.dargoh.projetospark.sparktemplate.commands

import br.com.devsrsouza.kotlinbukkitapi.dsl.command.command
import br.com.devsrsouza.kotlinbukkitapi.dsl.command.simpleCommand
import br.com.devsrsouza.kotlinbukkitapi.extensions.plugin.WithPlugin
import br.com.devsrsouza.kotlinbukkitapi.extensions.text.msg
import br.com.devsrsouza.kotlinbukkitapi.extensions.text.translateColor
import br.dargoh.projetospark.sparktemplate.SparkTemplate
import org.bukkit.Bukkit.broadcastMessage

class HelloWorldComamnd(override val plugin: SparkTemplate) : WithPlugin<SparkTemplate> {

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

    init {
        registerAnother()
        registerHelloWorld()
    }
}
import { Router } from 'express'
import OpenAI from 'openai'

export const aiRouter = Router()

const openai = new OpenAI({apikey : process.env.OPENAI_API_KEY})

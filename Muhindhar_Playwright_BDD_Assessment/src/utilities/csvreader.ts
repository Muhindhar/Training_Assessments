import fs from 'fs'
import path from 'path'
import {parse} from 'csv-parse/sync'

export interface logindet{
    type:string,
    email:string,
    password:string,
    message:string
}

export function csvdata():logindet[]{
    const filepath = path.resolve(__dirname,"../data-files/login.csv");
    const format = fs.readFileSync(filepath,'utf-8');
    return parse(format,{
        columns:true,
        skip_empty_lines:true,
        trim:true,
    }) as logindet[]
}
